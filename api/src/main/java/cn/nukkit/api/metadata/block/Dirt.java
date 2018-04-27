package cn.nukkit.api.metadata.block;

import cn.nukkit.api.metadata.Metadata;
import cn.nukkit.api.metadata.data.DirtType;
import com.google.common.base.Preconditions;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import javax.annotation.Nonnull;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Dirt implements Metadata {
    private final DirtType type;

    public static Dirt of(@Nonnull DirtType type) {
        Preconditions.checkNotNull(type, "type");
        return new Dirt(type);
    }

    public DirtType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dirt that = (Dirt) o;
        return this.type == that.type;
    }

    @Override
    public String toString() {
        return "Dirt(" +
                "type=" + type +
                ')';
    }
}