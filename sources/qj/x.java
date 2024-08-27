package qj;

import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisItemViewModel;
import com.assetgro.stockgro.widget.MarketSlider;
import com.google.android.material.slider.Slider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarketSlider f32070a;

    public /* synthetic */ x(MarketSlider marketSlider) {
        this.f32070a = marketSlider;
    }

    public final void a(Object obj, float f10) {
        int i10 = MarketSlider.f10647i;
        MarketSlider this$0 = this.f32070a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter((Slider) obj, "<anonymous parameter 0>");
        float E0 = (float) el.l.E0(2, f10);
        b0 b0Var = this$0.onValueChangeListener;
        if (b0Var != null) {
            bj.i iVar = (bj.i) b0Var;
            int i11 = iVar.f7012a;
            bj.j jVar = iVar.f7013b;
            switch (i11) {
                case 0:
                    ((StockAnalysisItemViewModel) jVar.v()).f10449p.postValue(Float.valueOf(E0));
                    break;
                case 1:
                    ((StockAnalysisItemViewModel) jVar.v()).f10451r.postValue(Float.valueOf(E0));
                    break;
                default:
                    ((StockAnalysisItemViewModel) jVar.v()).f10450q.postValue(Float.valueOf(E0));
                    break;
            }
        }
        this$0.f10649b.setText(String.valueOf(E0));
    }
}
