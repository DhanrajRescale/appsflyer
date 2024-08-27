package d2;

import android.os.Parcel;
import android.util.Base64;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public Parcel f13645a;

    public t1(String str) {
        Parcel obtain = Parcel.obtain();
        this.f13645a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public long a() {
        long j10;
        Parcel parcel = this.f13645a;
        byte readByte = parcel.readByte();
        if (readByte == 1) {
            j10 = 4294967296L;
        } else if (readByte == 2) {
            j10 = 8589934592L;
        } else {
            j10 = 0;
        }
        if (w2.n.a(j10, 0L)) {
            w2.n[] nVarArr = w2.m.f38803b;
            return w2.m.f38804c;
        }
        return yk.j.i1(j10, parcel.readFloat());
    }

    public void b(byte b10) {
        this.f13645a.writeByte(b10);
    }

    public void c(float f10) {
        this.f13645a.writeFloat(f10);
    }

    public void d(long j10) {
        long b10 = w2.m.b(j10);
        byte b11 = 0;
        if (!w2.n.a(b10, 0L)) {
            if (w2.n.a(b10, 4294967296L)) {
                b11 = 1;
            } else if (w2.n.a(b10, 8589934592L)) {
                b11 = 2;
            }
        }
        b(b11);
        if (!w2.n.a(w2.m.b(j10), 0L)) {
            c(w2.m.c(j10));
        }
    }
}
