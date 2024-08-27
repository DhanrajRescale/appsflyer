package jv;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21686a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21687b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f21686a = i10;
        this.f21687b = obj;
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        String str;
        int i10 = this.f21686a;
        Object obj = this.f21687b;
        switch (i10) {
            case 0:
                Long e10 = oVar.e(lv.a.OFFSET_SECONDS);
                if (e10 == null) {
                    return false;
                }
                sb2.append("GMT");
                if (((z) obj) == z.f21739a) {
                    return new j(HttpUrl.FRAGMENT_ENCODE_SET, "+HH:MM:ss").a(oVar, sb2);
                }
                int J0 = el.l.J0(e10.longValue());
                if (J0 == 0) {
                    return true;
                }
                int abs = Math.abs((J0 / 3600) % 100);
                int abs2 = Math.abs((J0 / 60) % 60);
                int abs3 = Math.abs(J0 % 60);
                if (J0 < 0) {
                    str = "-";
                } else {
                    str = "+";
                }
                sb2.append(str);
                sb2.append(abs);
                if (abs2 <= 0 && abs3 <= 0) {
                    return true;
                }
                sb2.append(":");
                sb2.append((char) ((abs2 / 10) + 48));
                sb2.append((char) ((abs2 % 10) + 48));
                if (abs3 <= 0) {
                    return true;
                }
                sb2.append(":");
                sb2.append((char) ((abs3 / 10) + 48));
                sb2.append((char) ((abs3 % 10) + 48));
                return true;
            default:
                sb2.append((String) obj);
                return true;
        }
    }

    public final String toString() {
        switch (this.f21686a) {
            case 1:
                return nn.d.k("'", ((String) this.f21687b).replace("'", "''"), "'");
            default:
                return super.toString();
        }
    }
}
