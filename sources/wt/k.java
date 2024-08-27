package wt;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.p0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\b"}, d2 = {"Lwt/k;", "Ljava/io/Externalizable;", HttpUrl.FRAGMENT_ENCODE_SET, "readResolve", "<init>", "()V", "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class k implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public Map f39484a;

    public k(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f39484a = map;
    }

    private final Object readResolve() {
        return this.f39484a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        if (readByte == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                d builder = new d(readInt);
                for (int i10 = 0; i10 < readInt; i10++) {
                    builder.put(input.readObject(), input.readObject());
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.c();
                builder.f39473m = true;
                if (builder.f39469i <= 0) {
                    builder = d.f39460o;
                    Intrinsics.d(builder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
                }
                this.f39484a = builder;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException(jr.h.n("Unsupported flags value: ", readByte));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.f39484a.size());
        for (Map.Entry entry : this.f39484a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public k() {
        this(p0.d());
    }
}
