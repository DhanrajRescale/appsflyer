package lg;

import android.widget.TextView;
import ba.lb;
import com.assetgro.stockgro.widget.ChipView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f24844b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i10) {
        super(1);
        this.f24843a = i10;
        this.f24844b = nVar;
    }

    public final void a(String str) {
        int i10 = this.f24843a;
        n nVar = this.f24844b;
        switch (i10) {
            case 0:
                ((lb) nVar.f17291u).f5347x.setText(str);
                return;
            case 1:
                ((lb) nVar.f17291u).f5349z.f4321t.setText(str);
                return;
            case 2:
                ((lb) nVar.f17291u).f5349z.f4320s.setText(str);
                return;
            case 3:
                ((lb) nVar.f17291u).f5349z.f4322u.setText(str);
                return;
            case 4:
                ((lb) nVar.f17291u).f5342s.setText(str);
                return;
            default:
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(nVar.f22629a.getContext()).m(str).e()).b()).z(((lb) nVar.f17291u).f5343t);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f24843a;
        n nVar = this.f24844b;
        switch (i10) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            case 4:
                a((String) obj);
                return Unit.f23355a;
            case 5:
                Pair pair = (Pair) obj;
                ChipView chipView = ((lb) nVar.f17291u).f5345v;
                String string = nVar.f22629a.getContext().getResources().getString(((Number) pair.f23353a).intValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                chipView.setChipText(string);
                chipView.setChipType((qj.j) pair.f23354b);
                return Unit.f23355a;
            case 6:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    TextView textView = ((lb) nVar.f17291u).f5344u;
                    textView.setText("CANCELLED");
                    textView.setVisibility(0);
                } else if (Intrinsics.a(bool, Boolean.FALSE)) {
                    TextView textView2 = ((lb) nVar.f17291u).f5344u;
                    textView2.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                    textView2.setVisibility(8);
                }
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
