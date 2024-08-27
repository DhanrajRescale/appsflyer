package zm;

import android.view.View;
import cn.e;
import cn.f;
import cn.i;
import s0.g;

/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: h, reason: collision with root package name */
    public static final f f42572h;

    static {
        f a10 = f.a(2, new a(null, g.f34069a, g.f34069a, null, null));
        f42572h = a10;
        a10.f8256f = 0.5f;
    }

    public a(i iVar, float f10, float f11, cn.g gVar, View view) {
        this.f42573b = new float[2];
        this.f42574c = iVar;
        this.f42575d = f10;
        this.f42576e = f11;
        this.f42577f = gVar;
        this.f42578g = view;
    }

    @Override // cn.e
    public final e a() {
        return new a(this.f42574c, this.f42575d, this.f42576e, this.f42577f, this.f42578g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10 = this.f42575d;
        float[] fArr = this.f42573b;
        fArr[0] = f10;
        fArr[1] = this.f42576e;
        this.f42577f.e(fArr);
        this.f42574c.a(this.f42578g, fArr);
        f42572h.c(this);
    }
}
