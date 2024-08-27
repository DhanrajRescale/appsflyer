package j9;

import android.animation.ValueAnimator;
import com.chaos.view.PinView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import d4.n1;
import d4.v0;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21223b;

    public /* synthetic */ w(Object obj, int i10) {
        this.f21222a = i10;
        this.f21223b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f21222a;
        Object obj = this.f21223b;
        switch (i10) {
            case 0:
                y yVar = (y) obj;
                s9.c cVar = yVar.f21238o;
                if (cVar != null) {
                    cVar.s(yVar.f21225b.d());
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PinView pinView = (PinView) obj;
                pinView.f10850n.setTextSize(pinView.getTextSize() * floatValue);
                pinView.f10850n.setAlpha((int) (255.0f * floatValue));
                pinView.postInvalidate();
                return;
            case 2:
                ((sm.b) obj).postInvalidate();
                return;
            case 3:
                ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                to.h hVar = ((BottomSheetBehavior) obj).f11180i;
                if (hVar != null) {
                    hVar.o(floatValue2);
                    return;
                }
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vo.c cVar2 = (vo.c) obj;
                Iterator it = cVar2.f38216k.iterator();
                while (it.hasNext()) {
                    bp.a aVar = (bp.a) it.next();
                    aVar.Y = 1.2f;
                    aVar.J = floatValue3;
                    aVar.X = floatValue3;
                    aVar.Z = vn.a.b(s0.g.f34069a, 1.0f, 0.19f, 1.0f, floatValue3);
                    aVar.invalidateSelf();
                }
                WeakHashMap weakHashMap = n1.f13788a;
                v0.k(cVar2);
                return;
            case 6:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            default:
                ((TextInputLayout) obj).J0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
