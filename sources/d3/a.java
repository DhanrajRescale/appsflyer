package d3;

import da.e;
import jr.h;
import nn.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f13710a;

    /* renamed from: b, reason: collision with root package name */
    public int f13711b;

    /* renamed from: c, reason: collision with root package name */
    public int f13712c;

    /* renamed from: d, reason: collision with root package name */
    public float f13713d;

    /* renamed from: e, reason: collision with root package name */
    public String f13714e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13715f;

    public final String toString() {
        String n10 = d.n(new StringBuilder(), this.f13710a, ':');
        switch (this.f13711b) {
            case 900:
                StringBuilder p10 = e.p(n10);
                p10.append(this.f13712c);
                return p10.toString();
            case 901:
                StringBuilder p11 = e.p(n10);
                p11.append(this.f13713d);
                return p11.toString();
            case 902:
                StringBuilder p12 = e.p(n10);
                p12.append("#" + ("00000000" + Integer.toHexString(this.f13712c)).substring(r1.length() - 8));
                return p12.toString();
            case 903:
                StringBuilder p13 = e.p(n10);
                p13.append(this.f13714e);
                return p13.toString();
            case 904:
                StringBuilder p14 = e.p(n10);
                p14.append(Boolean.valueOf(this.f13715f));
                return p14.toString();
            case 905:
                StringBuilder p15 = e.p(n10);
                p15.append(this.f13713d);
                return p15.toString();
            default:
                return h.r(n10, "????");
        }
    }
}
