package xe;

import android.widget.ProgressBar;
import ba.a8;
import com.assetgro.stockgro.prod.R;
import com.bumptech.glide.g;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f40187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f40186a = i10;
        this.f40187b = dVar;
    }

    public final void a(String str) {
        int i10 = this.f40186a;
        d dVar = this.f40187b;
        switch (i10) {
            case 0:
                ((a8) dVar.f17291u).f4171u.setText(str);
                return;
            case 1:
                ((a8) dVar.f17291u).f4172v.setText(str);
                return;
            case 2:
                ((a8) dVar.f17291u).f4174x.setText(str);
                return;
            case 3:
                ((a8) dVar.f17291u).f4173w.setText(str);
                return;
            case 4:
                ((a8) dVar.f17291u).f4169s.setText(str);
                return;
            case 5:
                ((a8) dVar.f17291u).f4170t.setText(str);
                return;
            default:
                ((g) ((g) ((g) com.bumptech.glide.b.e(dVar.f22629a.getContext()).m(str).e()).i()).l(R.drawable.ic_placeholder_user)).z(((a8) dVar.f17291u).f4175y);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40186a) {
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
                a((String) obj);
                return Unit.f23355a;
            case 6:
                a((String) obj);
                return Unit.f23355a;
            default:
                Integer num = (Integer) obj;
                d dVar = this.f40187b;
                ((a8) dVar.f17291u).f4176z.setMax(100);
                ProgressBar progressBar = ((a8) dVar.f17291u).f4176z;
                Intrinsics.c(num);
                progressBar.setProgress(num.intValue());
                return Unit.f23355a;
        }
    }
}
