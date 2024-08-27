package bj;

import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import ba.tc;
import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisItemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import qj.z;
import ut.p;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f7011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i10) {
        super(1);
        this.f7010a = i10;
        this.f7011b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f7010a;
        j jVar = this.f7011b;
        switch (i10) {
            case 0:
                float f10 = ((210 * ((zi.m) obj).f42500c) / 100) - 105;
                RotateAnimation rotateAnimation = new RotateAnimation(((StockAnalysisItemViewModel) jVar.v()).f10444k, f10, 1, 0.5f, 1, 1.0f);
                rotateAnimation.setDuration(50L);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setFillAfter(true);
                ((tc) jVar.f17291u).A.startAnimation(rotateAnimation);
                ((StockAnalysisItemViewModel) jVar.v()).f10444k = f10;
                return Unit.f23355a;
            case 1:
                p pVar = (p) obj;
                if (pVar != null) {
                    ((tc) jVar.f17291u).f6188x.setMarketData((z) pVar.f37400a);
                    tc tcVar = (tc) jVar.f17291u;
                    tcVar.f6189y.setMarketData((z) pVar.f37401b);
                    tcVar.f6190z.setMarketData((z) pVar.f37402c);
                }
                return Unit.f23355a;
            default:
                zi.k kVar = (zi.k) ((kj.j) obj).a();
                if (kVar != null) {
                    jVar.f7014x.invoke(kVar);
                }
                return Unit.f23355a;
        }
    }
}
