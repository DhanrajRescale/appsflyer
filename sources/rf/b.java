package rf;

import android.view.View;
import ba.va;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ChipView;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f33689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(1);
        this.f33688a = i10;
        this.f33689b = cVar;
    }

    public final void a(String str) {
        int i10 = this.f33688a;
        c cVar = this.f33689b;
        switch (i10) {
            case 0:
                ((va) cVar.f17291u).f6415u.setText(str);
                return;
            case 1:
                ChipView chipView = ((va) cVar.f17291u).f6416v;
                Intrinsics.c(str);
                chipView.setChipText(str);
                View view = cVar.f22629a;
                boolean a10 = Intrinsics.a(str, view.getResources().getString(R.string.text_league));
                m mVar = cVar.f17291u;
                if (a10) {
                    ((va) mVar).f6416v.setChipType(qj.j.f32017a);
                    return;
                }
                if (Intrinsics.a(str, view.getResources().getString(R.string.text_social))) {
                    ((va) mVar).f6416v.setChipType(qj.j.f32019c);
                    return;
                }
                if (Intrinsics.a(str, view.getResources().getString(R.string.text_portfolio))) {
                    ((va) mVar).f6416v.setChipType(qj.j.f32021e);
                    return;
                } else if (Intrinsics.a(str, view.getResources().getString(R.string.text_payment))) {
                    ((va) mVar).f6416v.setChipType(qj.j.f32018b);
                    return;
                } else {
                    ((va) mVar).f6416v.setChipType(qj.j.f32020d);
                    return;
                }
            case 2:
                ((va) cVar.f17291u).f6413s.setText(str);
                return;
            default:
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(cVar.f22629a.getContext()).m(str).e()).i()).l(R.drawable.ic_placeholder_user)).z(((va) cVar.f17291u).f6414t);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f33688a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
