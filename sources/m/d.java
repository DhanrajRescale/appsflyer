package m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25508b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f25507a = i10;
        this.f25508b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f25507a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f25508b;
                actionBarOverlayLayout.f973w = null;
                actionBarOverlayLayout.f961k = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f25507a;
        Object obj = this.f25508b;
        switch (i10) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f973w = null;
                actionBarOverlayLayout.f961k = false;
                return;
            case 1:
                ((t7.p) obj).m();
                animator.removeListener(this);
                return;
            case 2:
                u7.f fVar = (u7.f) obj;
                ArrayList arrayList = new ArrayList(fVar.f36912e);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((u7.c) arrayList.get(i11)).a(fVar);
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).f11158h = null;
                return;
            case 4:
            case 7:
            default:
                super.onAnimationEnd(animator);
                return;
            case 5:
                a3.a.u(obj);
                throw null;
            case 6:
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) obj;
                if (((ValueAnimator) tVar.f11784d) == animator) {
                    tVar.f11784d = null;
                    return;
                }
                return;
            case 8:
                super.onAnimationEnd(animator);
                vo.c cVar = (vo.c) obj;
                t7.x m10 = pn.e.m(cVar);
                Iterator it = cVar.f38216k.iterator();
                while (it.hasNext()) {
                    bp.a aVar = (bp.a) it.next();
                    int i12 = m10.f35538a;
                    ViewOverlay viewOverlay = m10.f35539b;
                    switch (i12) {
                        case 0:
                            viewOverlay.remove(aVar);
                            break;
                        default:
                            viewOverlay.remove(aVar);
                            break;
                    }
                }
                return;
            case 9:
                zo.i iVar = (zo.i) obj;
                iVar.q();
                iVar.f42611r.start();
                return;
            case 10:
                ((ExpandableTransformationBehavior) obj).f11564b = null;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f25507a) {
            case 7:
                super.onAnimationRepeat(animator);
                oo.q qVar = (oo.q) this.f25508b;
                qVar.f30227g = (qVar.f30227g + 1) % qVar.f30226f.f30169c.length;
                qVar.f30228h = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f25507a;
        Object obj = this.f25508b;
        switch (i10) {
            case 2:
                u7.f fVar = (u7.f) obj;
                ArrayList arrayList = new ArrayList(fVar.f36912e);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((u7.c) arrayList.get(i11)).b(fVar);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                a3.a.u(obj);
                throw null;
            case 5:
                a3.a.u(obj);
                throw null;
        }
    }
}
