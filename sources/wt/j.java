package wt;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.i0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\b"}, d2 = {"Lwt/j;", "Ljava/io/Externalizable;", HttpUrl.FRAGMENT_ENCODE_SET, "readResolve", "<init>", "()V", "c", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public Collection f39481a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39482b;

    public j(int i10, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f39481a = collection;
        this.f39482b = i10;
    }

    private final Object readResolve() {
        return this.f39481a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        AbstractCollection abstractCollection;
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        int i10 = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                int i11 = 0;
                if (i10 != 0) {
                    if (i10 == 1) {
                        l builder = new l(new d(readInt));
                        while (i11 < readInt) {
                            builder.add(input.readObject());
                            i11++;
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        d dVar = builder.f39486a;
                        dVar.c();
                        dVar.f39473m = true;
                        if (dVar.f39469i <= 0) {
                            Intrinsics.d(d.f39460o, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
                        }
                        abstractCollection = builder;
                        if (dVar.f39469i <= 0) {
                            abstractCollection = l.f39485b;
                        }
                    } else {
                        throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
                    }
                } else {
                    c builder2 = new c(readInt);
                    while (i11 < readInt) {
                        builder2.add(input.readObject());
                        i11++;
                    }
                    Intrinsics.checkNotNullParameter(builder2, "builder");
                    builder2.k();
                    builder2.f39458c = true;
                    int i12 = builder2.f39457b;
                    abstractCollection = builder2;
                    if (i12 <= 0) {
                        abstractCollection = c.f39455d;
                    }
                }
                this.f39481a = abstractCollection;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.f39482b);
        output.writeInt(this.f39481a.size());
        Iterator it = this.f39481a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public j() {
        this(0, i0.f38321a);
    }
}
