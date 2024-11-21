/*
 * This file is a part of the nadeshiko project. nadeshiko is free software, licensed under the MIT license.
 *
 * Usage of these works (including, yet not limited to, reuse, modification, copying, distribution, and selling) is
 * permitted, provided that the relevant copyright notice and permission notice (as specified in LICENSE) shall be
 * included in all copies or substantial portions of this software.
 *
 * These works are provided "AS IS" with absolutely no warranty of any kind, either expressed or implied.
 *
 * You should have received a copy of the MIT License alongside this software; refer to LICENSE for information.
 * If not, refer to https://mit-license.org.
 */

package io.nadeshiko.networth.item;

import io.nadeshiko.networth.Constants;
import lombok.NonNull;

public class ExoticManager {

    public boolean isExotic(@NonNull Item item) {
        return false; // TODO
    }

    public double getCleanlinessMultiplier(@NonNull Item item) {
        if (item.isRecombobulated()) {
            return Constants.SCUFFED_EXOTIC_MULTIPLIER;
        } else if (item.getHotPotatoBooks() > 0) {
            return Constants.HPB_EXOTIC_MULTIPLIER;
        } else if (item.getReforge() != null) {
            return Constants.CER_EXOTIC_MULTIPLIER;
        }

        return 1;
    }
}