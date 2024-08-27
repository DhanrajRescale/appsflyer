package wh;

import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.AuthUiModel;
import com.assetgro.stockgro.ui.social.auth.SocialAuthActivity;
import iu.k;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialAuthActivity f39078b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SocialAuthActivity socialAuthActivity, int i10) {
        super(1);
        this.f39077a = i10;
        this.f39078b = socialAuthActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SocialAuthActivity socialAuthActivity = this.f39078b;
        int i10 = this.f39077a;
        switch (i10) {
            case 0:
                AuthUiModel authUiModel = (AuthUiModel) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.c(authUiModel);
                        socialAuthActivity.R(authUiModel);
                        break;
                    default:
                        Intrinsics.c(authUiModel);
                        socialAuthActivity.R(authUiModel);
                        break;
                }
                return Unit.f23355a;
            case 1:
                AuthUiModel authUiModel2 = (AuthUiModel) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.c(authUiModel2);
                        socialAuthActivity.R(authUiModel2);
                        break;
                    default:
                        Intrinsics.c(authUiModel2);
                        socialAuthActivity.R(authUiModel2);
                        break;
                }
                return Unit.f23355a;
            default:
                Pair pair = (Pair) obj;
                socialAuthActivity.C(new AnalyticEvent((String) pair.f23353a, (HashMap) pair.f23354b));
                return Unit.f23355a;
        }
    }
}
