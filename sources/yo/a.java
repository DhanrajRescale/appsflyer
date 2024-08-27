package yo;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class a extends ll.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(17);
        this.f41743b = i10;
    }

    @Override // ll.a
    public final void j(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float cos;
        float f11;
        float b10;
        switch (this.f41743b) {
            case 0:
                RectF a10 = ll.a.a(tabLayout, view);
                RectF a11 = ll.a.a(tabLayout, view2);
                if (a10.left < a11.left) {
                    double d10 = (f10 * 3.141592653589793d) / 2.0d;
                    f11 = (float) (1.0d - Math.cos(d10));
                    cos = (float) Math.sin(d10);
                } else {
                    double d11 = (f10 * 3.141592653589793d) / 2.0d;
                    float sin = (float) Math.sin(d11);
                    cos = (float) (1.0d - Math.cos(d11));
                    f11 = sin;
                }
                drawable.setBounds(vn.a.c((int) a10.left, f11, (int) a11.left), drawable.getBounds().top, vn.a.c((int) a10.right, cos, (int) a11.right), drawable.getBounds().bottom);
                return;
            default:
                if (f10 >= 0.5f) {
                    view = view2;
                }
                RectF a12 = ll.a.a(tabLayout, view);
                if (f10 < 0.5f) {
                    b10 = vn.a.b(1.0f, s0.g.f34069a, s0.g.f34069a, 0.5f, f10);
                } else {
                    b10 = vn.a.b(s0.g.f34069a, 1.0f, 0.5f, 1.0f, f10);
                }
                drawable.setBounds((int) a12.left, drawable.getBounds().top, (int) a12.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b10 * 255.0f));
                return;
        }
    }
}
