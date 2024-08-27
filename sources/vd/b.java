package vd;

import com.assetgro.stockgro.ui.chat.detail.members.AddMembersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddMembersViewModel f37961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AddMembersViewModel addMembersViewModel, int i10) {
        super(1);
        this.f37960a = i10;
        this.f37961b = addMembersViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f37960a;
        AddMembersViewModel addMembersViewModel = this.f37961b;
        switch (i10) {
            case 0:
                addMembersViewModel.f9084g.postValue(Boolean.FALSE);
                addMembersViewModel.f9266p.postValue(Boolean.TRUE);
                return Unit.f23355a;
            default:
                addMembersViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
