package w6;

import android.graphics.Color;
import e5.m;
import yk.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f38836a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38837b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f38838c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f38839d;

    /* renamed from: e, reason: collision with root package name */
    public final float f38840e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38841f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f38842g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f38843h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f38844i;

    /* renamed from: j, reason: collision with root package name */
    public final int f38845j;

    public d(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f38836a = str;
        this.f38837b = i10;
        this.f38838c = num;
        this.f38839d = num2;
        this.f38840e = f10;
        this.f38841f = z10;
        this.f38842g = z11;
        this.f38843h = z12;
        this.f38844i = z13;
        this.f38845j = i11;
    }

    public static int a(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                nn.d.v("Ignoring unknown alignment: ", str, "SsaStyle");
                return -1;
        }
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e10) {
            m.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            j.E0(z10);
            return Integer.valueOf(Color.argb(kp.j.D(((parseLong >> 24) & 255) ^ 255), kp.j.D(parseLong & 255), kp.j.D((parseLong >> 8) & 255), kp.j.D((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            m.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
