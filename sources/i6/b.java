package i6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.m0;
import b5.p0;
import e5.x;
import jr.h;

/* loaded from: classes.dex */
public class b implements p0 {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f19692a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19693b;

    public b(String str, String str2) {
        this.f19692a = str;
        this.f19693b = str2;
    }

    @Override // b5.p0
    public final void H(m0 m0Var) {
        String str = this.f19692a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        String str2 = this.f19693b;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 == 4) {
                            m0Var.f3438b = str2;
                            return;
                        }
                        return;
                    }
                    m0Var.f3440d = str2;
                    return;
                }
                m0Var.f3443g = str2;
                return;
            }
            m0Var.f3437a = str2;
            return;
        }
        m0Var.f3439c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f19692a.equals(bVar.f19692a) && this.f19693b.equals(bVar.f19693b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19693b.hashCode() + h.g(this.f19692a, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.f19692a + "=" + this.f19693b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19692a);
        parcel.writeString(this.f19693b);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f19692a = readString;
        this.f19693b = parcel.readString();
    }
}
