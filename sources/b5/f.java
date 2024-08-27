package b5;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3276a;

    /* renamed from: b, reason: collision with root package name */
    public int f3277b;

    /* renamed from: c, reason: collision with root package name */
    public int f3278c;

    /* renamed from: d, reason: collision with root package name */
    public int f3279d;

    /* renamed from: e, reason: collision with root package name */
    public int f3280e;

    public f(int i10, int i11, int i12, int i13, int i14) {
        this.f3276a = i10;
        this.f3277b = i11;
        this.f3278c = i12;
        this.f3279d = i13;
        this.f3280e = i14;
    }

    public static f b(String str) {
        char c10;
        yk.j.E0(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String P1 = dp.b.P1(split[i14].trim());
            P1.getClass();
            switch (P1.hashCode()) {
                case 100571:
                    if (P1.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (P1.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (P1.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (P1.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 != -1 && i11 != -1 && i13 != -1) {
            return new f(i10, i11, i12, i13, split.length);
        }
        return null;
    }

    public boolean a() {
        int i10 = this.f3276a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.f3279d;
            int i13 = this.f3277b;
            if (((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.f3279d;
            int i15 = this.f3278c;
            if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f3280e;
            int i17 = this.f3277b;
            if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f3280e;
            int i19 = this.f3278c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ f() {
        this.f3276a = 0;
    }
}
