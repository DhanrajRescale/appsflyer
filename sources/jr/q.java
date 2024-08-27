package jr;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class q implements ir.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f21654a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21655b;

    public q(String str, int i10) {
        this.f21654a = str;
        this.f21655b = i10;
    }

    public final boolean a() {
        if (this.f21655b == 0) {
            return false;
        }
        String trim = d().trim();
        if (j.f21616e.matcher(trim).matches()) {
            return true;
        }
        if (j.f21617f.matcher(trim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", trim, "boolean"));
    }

    public final double b() {
        if (this.f21655b == 0) {
            return 0.0d;
        }
        String trim = d().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", trim, "double"), e10);
        }
    }

    public final long c() {
        if (this.f21655b == 0) {
            return 0L;
        }
        String trim = d().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", trim, "long"), e10);
        }
    }

    public final String d() {
        if (this.f21655b == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str = this.f21654a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }
}
