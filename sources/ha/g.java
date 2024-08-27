package ha;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import ba.mh;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailFragment;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioOrdersViewModel;
import kotlin.jvm.internal.Intrinsics;
import qu.r0;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18082b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f18081a = i10;
        this.f18082b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        rc.i iVar;
        int i10 = this.f18081a;
        Object obj = this.f18082b;
        switch (i10) {
            case 0:
                OptionDetailFragment this$0 = (OptionDetailFragment) obj;
                int i11 = OptionDetailFragment.f8591h;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        ((mh) this$0.q()).M.requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    ((mh) this$0.q()).M.requestDisallowInterceptTouchEvent(true);
                }
                return false;
            case 1:
                rc.h this$02 = (rc.h) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (motionEvent.getAction() == 0) {
                    rc.i iVar2 = this$02.f33595i;
                    if (iVar2 != null) {
                        ((sc.i) iVar2).H(false);
                    }
                    yk.g.H(hl.f.d(r0.f32256b), null, null, new rc.g(this$02, null), 3);
                } else if (motionEvent.getAction() == 1 && (iVar = this$02.f33595i) != null) {
                    ((sc.i) iVar).H(true);
                }
                return false;
            case 2:
                GestureDetector gestureDetector = (GestureDetector) obj;
                Intrinsics.checkNotNullParameter(gestureDetector, "$gestureDetector");
                gestureDetector.onTouchEvent(motionEvent);
                return true;
            case 3:
                lg.k this$03 = (lg.k) obj;
                int i12 = lg.k.f24839h;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                ((PortfolioHistoryViewModel) this$03.r()).f9823s = true;
                if (view == null) {
                    return true;
                }
                return view.onTouchEvent(motionEvent);
            case 4:
                tg.o this$04 = (tg.o) obj;
                int i13 = tg.o.f36067i;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                ((PortfolioOrdersViewModel) this$04.r()).f9922u = true;
                if (view == null) {
                    return true;
                }
                return view.onTouchEvent(motionEvent);
            default:
                zo.i iVar3 = (zo.i) obj;
                iVar3.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - iVar3.f42608o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        iVar3.f42606m = false;
                    }
                    iVar3.u();
                    iVar3.f42606m = true;
                    iVar3.f42608o = System.currentTimeMillis();
                }
                return false;
        }
    }
}
