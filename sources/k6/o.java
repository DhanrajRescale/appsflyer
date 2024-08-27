package k6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.m0;
import e5.x;
import java.util.ArrayList;
import lp.j1;
import lp.o0;

/* loaded from: classes.dex */
public final class o extends k {
    public static final Parcelable.Creator<o> CREATOR = new d(6);

    /* renamed from: b, reason: collision with root package name */
    public final String f22261b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f22262c;

    public o(String str, String str2, j1 j1Var) {
        super(str);
        yk.j.E0(!j1Var.isEmpty());
        this.f22261b = str2;
        o0 q10 = o0.q(j1Var);
        this.f22262c = q10;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // b5.p0
    public final void H(m0 m0Var) {
        Integer num;
        String str = this.f22250a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        o0 o0Var = this.f22262c;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    m0Var.c((CharSequence) o0Var.get(0));
                    return;
                case 1:
                case 11:
                    m0Var.e((CharSequence) o0Var.get(0));
                    return;
                case 2:
                case '\f':
                    String str2 = (String) o0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    m0Var.h(Integer.valueOf(parseInt));
                    m0Var.g(Integer.valueOf(parseInt2));
                    return;
                case 3:
                case 17:
                    m0Var.d((CharSequence) o0Var.get(0));
                    return;
                case 4:
                case 18:
                    m0Var.b((CharSequence) o0Var.get(0));
                    return;
                case 5:
                case 19:
                    m0Var.f((CharSequence) o0Var.get(0));
                    return;
                case 6:
                case 20:
                    String[] N = x.N((String) o0Var.get(0));
                    int parseInt3 = Integer.parseInt(N[0]);
                    if (N.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(N[1]));
                    } else {
                        num = null;
                    }
                    m0Var.o(Integer.valueOf(parseInt3));
                    m0Var.n(num);
                    return;
                case 7:
                case 16:
                    m0Var.m((CharSequence) o0Var.get(0));
                    return;
                case '\b':
                case 15:
                    m0Var.p((CharSequence) o0Var.get(0));
                    return;
                case '\t':
                case 21:
                    m0Var.i(Integer.valueOf(Integer.parseInt((String) o0Var.get(0))));
                    return;
                case '\r':
                    ArrayList a10 = a((String) o0Var.get(0));
                    int size = a10.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                m0Var.g((Integer) a10.get(2));
                            } else {
                                return;
                            }
                        }
                        m0Var.h((Integer) a10.get(1));
                    }
                    m0Var.i((Integer) a10.get(0));
                    return;
                case 14:
                    ArrayList a11 = a((String) o0Var.get(0));
                    int size2 = a11.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                m0Var.j((Integer) a11.get(2));
                            } else {
                                return;
                            }
                        }
                        m0Var.k((Integer) a11.get(1));
                    }
                    m0Var.l((Integer) a11.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (x.a(this.f22250a, oVar.f22250a) && x.a(this.f22261b, oVar.f22261b) && this.f22262c.equals(oVar.f22262c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = jr.h.g(this.f22250a, 527, 31);
        String str = this.f22261b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f22262c.hashCode() + ((g10 + i10) * 31);
    }

    @Override // k6.k
    public final String toString() {
        return this.f22250a + ": description=" + this.f22261b + ": values=" + this.f22262c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22250a);
        parcel.writeString(this.f22261b);
        parcel.writeStringArray((String[]) this.f22262c.toArray(new String[0]));
    }
}
