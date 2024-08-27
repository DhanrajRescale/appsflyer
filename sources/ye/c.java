package ye;

import com.assetgro.stockgro.data.model.InvitedFriendDto;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f41601b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f41602c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f41603d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f41604e = new c(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41605a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f41605a = i10;
    }

    public final String a(InvitedFriendDto invitedFriendDto) {
        switch (this.f41605a) {
            case 1:
                return ij.h.f20067a.q(20.0d);
            case 2:
                return invitedFriendDto.getImageUrl();
            default:
                return invitedFriendDto.getDisplayName();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41605a) {
            case 0:
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
            case 1:
                return a((InvitedFriendDto) obj);
            case 2:
                return a((InvitedFriendDto) obj);
            default:
                return a((InvitedFriendDto) obj);
        }
    }
}
