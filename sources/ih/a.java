package ih;

import android.content.Intent;
import android.widget.Toast;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.model.AccountDeleteResponse;
import com.assetgro.stockgro.feature_onboarding.presentation.login.deletion.DeleteConfirmationActivity;
import com.assetgro.stockgro.ui.profile.self.DeleteAccountViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f19986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(1);
        this.f19985a = i10;
        this.f19986b = bVar;
    }

    public final void a(String pin) {
        int i10 = this.f19985a;
        b bVar = this.f19986b;
        switch (i10) {
            case 1:
                Toast.makeText(bVar.requireContext(), pin, 0).show();
                return;
            default:
                Intrinsics.checkNotNullParameter(pin, "it");
                DeleteAccountViewModel deleteAccountViewModel = (DeleteAccountViewModel) bVar.t();
                Intrinsics.checkNotNullParameter(pin, "pin");
                deleteAccountViewModel.f9070f.postValue(Boolean.TRUE);
                yk.g.H(u0.f(deleteAccountViewModel), null, null, new c(deleteAccountViewModel, pin, null), 3);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        List<String> text;
        int i10 = this.f19985a;
        b bVar = this.f19986b;
        switch (i10) {
            case 0:
                AccountDeleteResponse accountDeleteResponse = (AccountDeleteResponse) obj;
                Intent intent = new Intent(bVar.requireContext(), (Class<?>) DeleteConfirmationActivity.class);
                if (accountDeleteResponse != null && (text = accountDeleteResponse.getText()) != null) {
                    str = text.get(0);
                } else {
                    str = null;
                }
                intent.putExtra("DELETE_ACCOUNT", str);
                intent.addFlags(335577088);
                bVar.startActivity(intent);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = bVar.f17276h;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    com.kaopiz.kprogresshud.f fVar2 = bVar.f17276h;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
