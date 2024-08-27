package ih;

import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditProfileViewModel f20006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(EditProfileViewModel editProfileViewModel, yt.a aVar) {
        super(2, aVar);
        this.f20006a = editProfileViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f20006a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        EditProfileViewModel editProfileViewModel = this.f20006a;
        editProfileViewModel.f10037u.postValue(Boolean.valueOf(editProfileViewModel.f10030n.b("show_delete_account_button")));
        return Unit.f23355a;
    }
}
