package fa;

import el.l;
import okhttp3.HttpUrl;
import s0.g;
import vm.c;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f15989a;

    public a(double d10) {
        this.f15989a = d10;
    }

    @Override // vm.c
    public final String a(float f10) {
        if (((int) f10) == 0) {
            return "0";
        }
        if (f10 > g.f34069a) {
            return "+";
        }
        double d10 = f10;
        double E0 = l.E0(2, d10);
        double d11 = this.f15989a;
        if (E0 == (-d11) || l.E0(2, d10) == d11) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (f10 >= g.f34069a) {
            return "0";
        }
        return "-";
    }
}
