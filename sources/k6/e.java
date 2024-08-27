package k6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends k {
    public static final Parcelable.Creator<e> CREATOR = new d(0);

    /* renamed from: b, reason: collision with root package name */
    public final String f22233b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22234c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22235d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f22236e;

    /* renamed from: f, reason: collision with root package name */
    public final k[] f22237f;

    public e(String str, boolean z10, boolean z11, String[] strArr, k[] kVarArr) {
        super("CTOC");
        this.f22233b = str;
        this.f22234c = z10;
        this.f22235d = z11;
        this.f22236e = strArr;
        this.f22237f = kVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f22234c == eVar.f22234c && this.f22235d == eVar.f22235d && x.a(this.f22233b, eVar.f22233b) && Arrays.equals(this.f22236e, eVar.f22236e) && Arrays.equals(this.f22237f, eVar.f22237f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f22234c ? 1 : 0)) * 31) + (this.f22235d ? 1 : 0)) * 31;
        String str = this.f22233b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22233b);
        parcel.writeByte(this.f22234c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22235d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f22236e);
        k[] kVarArr = this.f22237f;
        parcel.writeInt(kVarArr.length);
        for (k kVar : kVarArr) {
            parcel.writeParcelable(kVar, 0);
        }
    }

    public e(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f22233b = readString;
        this.f22234c = parcel.readByte() != 0;
        this.f22235d = parcel.readByte() != 0;
        this.f22236e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f22237f = new k[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f22237f[i11] = (k) parcel.readParcelable(k.class.getClassLoader());
        }
    }
}
