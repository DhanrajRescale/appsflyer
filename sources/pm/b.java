package pm;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.assetgro.stockgro.prod.R;
import com.github.clans.fab.FloatingActionButton;
import com.jsibbold.zoomage.ZoomageView;
import kotlin.jvm.internal.Intrinsics;
import m.w;

/* loaded from: classes.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31168b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f31167a = i10;
        this.f31168b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.f31167a) {
            case 2:
                int action = motionEvent.getAction();
                Object obj = this.f31168b;
                if (action == 1) {
                    ((ZoomageView) obj).E = true;
                }
                ((ZoomageView) obj).F = false;
                return false;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        int i10 = this.f31167a;
        Object obj = this.f31168b;
        switch (i10) {
            case 0:
                FloatingActionButton floatingActionButton = (FloatingActionButton) obj;
                k kVar = (k) floatingActionButton.getTag(R.id.fab_label);
                if (kVar != null) {
                    kVar.c();
                }
                floatingActionButton.h();
                return super.onDown(e10);
            case 1:
                k kVar2 = (k) obj;
                kVar2.c();
                FloatingActionButton floatingActionButton2 = kVar2.f31217m;
                if (floatingActionButton2 != null) {
                    floatingActionButton2.h();
                }
                return super.onDown(e10);
            default:
                Intrinsics.e(e10, "e");
            case 2:
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e12, MotionEvent e22, float f10, float f11) {
        switch (this.f31167a) {
            case 3:
                Intrinsics.e(e12, "e1");
                Intrinsics.e(e22, "e2");
                ws.c cVar = (ws.c) ((ws.a) ((w) this.f31168b).f25765f);
                cVar.f39417a.c(f10);
                cVar.f39418b.c(f11);
                return true;
            default:
                return super.onFling(e12, e22, f10, f11);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e10) {
        switch (this.f31167a) {
            case 3:
                Intrinsics.e(e10, "e");
                return;
            default:
                super.onLongPress(e10);
                return;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent initialEvent, MotionEvent currentEvent, float f10, float f11) {
        switch (this.f31167a) {
            case 3:
                Intrinsics.e(initialEvent, "initialEvent");
                Intrinsics.e(currentEvent, "currentEvent");
                float f12 = -f10;
                ws.c cVar = (ws.c) ((ws.a) ((w) this.f31168b).f25765f);
                cVar.f39417a.a(f12);
                cVar.f39418b.a(-f11);
                return true;
            default:
                return super.onScroll(initialEvent, currentEvent, f10, f11);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e10) {
        switch (this.f31167a) {
            case 3:
                Intrinsics.e(e10, "e");
                return;
            default:
                super.onShowPress(e10);
                return;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.f31167a) {
            case 2:
                ((ZoomageView) this.f31168b).F = false;
                return false;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        int i10 = this.f31167a;
        Object obj = this.f31168b;
        switch (i10) {
            case 0:
                FloatingActionButton floatingActionButton = (FloatingActionButton) obj;
                k kVar = (k) floatingActionButton.getTag(R.id.fab_label);
                if (kVar != null) {
                    kVar.d();
                }
                floatingActionButton.i();
                return super.onSingleTapUp(e10);
            case 1:
                k kVar2 = (k) obj;
                kVar2.d();
                FloatingActionButton floatingActionButton2 = kVar2.f31217m;
                if (floatingActionButton2 != null) {
                    floatingActionButton2.i();
                }
                return super.onSingleTapUp(e10);
            case 2:
                ((ZoomageView) obj).F = true;
                return false;
            default:
                Intrinsics.e(e10, "e");
                return true;
        }
    }
}
