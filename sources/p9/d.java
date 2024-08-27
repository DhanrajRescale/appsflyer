package p9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f30788a;

    /* renamed from: b, reason: collision with root package name */
    public final char f30789b;

    /* renamed from: c, reason: collision with root package name */
    public final double f30790c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30791d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30792e;

    public d(ArrayList arrayList, char c10, double d10, String str, String str2) {
        this.f30788a = arrayList;
        this.f30789b = c10;
        this.f30790c = d10;
        this.f30791d = str;
        this.f30792e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + jr.h.g(str, c10 * 31, 31);
    }

    public final int hashCode() {
        return a(this.f30789b, this.f30792e, this.f30791d);
    }
}
