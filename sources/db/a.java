package db;

import android.view.View;
import android.widget.TextView;
import ba.qm;
import com.assetgro.stockgro.feature_onboarding.presentation.login.reset.ReSetPin2Fragment;
import com.assetgro.stockgro.prod.R;
import com.kaopiz.kprogresshud.f;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q6.l;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReSetPin2Fragment f14282b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ReSetPin2Fragment reSetPin2Fragment, int i10) {
        super(1);
        this.f14281a = i10;
        this.f14282b = reSetPin2Fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f14281a;
        ReSetPin2Fragment reSetPin2Fragment = this.f14282b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    f fVar = reSetPin2Fragment.f17283a;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    f fVar2 = reSetPin2Fragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            case 1:
                l.h(reSetPin2Fragment).o(new androidx.navigation.a(R.id.action_re_set_pin_fragment_to_password_updated_fragment));
                return Unit.f23355a;
            default:
                Intrinsics.checkNotNullParameter((View) obj, "<anonymous parameter 0>");
                qm qmVar = (qm) reSetPin2Fragment.q();
                qmVar.f5879t.setText(((qm) reSetPin2Fragment.q()).f5878s.getTextInput(), TextView.BufferType.EDITABLE);
                return Unit.f23355a;
        }
    }
}
