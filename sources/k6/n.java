package k6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends k {
    public static final Parcelable.Creator<n> CREATOR = new d(5);

    /* renamed from: b, reason: collision with root package name */
    public final String f22259b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f22260c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f22259b = str;
        this.f22260c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (x.a(this.f22259b, nVar.f22259b) && Arrays.equals(this.f22260c, nVar.f22260c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f22259b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f22260c) + ((527 + i10) * 31);
    }

    @Override // k6.k
    public final String toString() {
        return this.f22250a + ": owner=" + this.f22259b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22259b);
        parcel.writeByteArray(this.f22260c);
    }

    public n(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f22259b = readString;
        this.f22260c = parcel.createByteArray();
    }
}
