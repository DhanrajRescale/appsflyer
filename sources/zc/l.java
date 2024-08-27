package zc;

import com.assetgro.stockgro.data.model.LeaderBoardUserDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserRepository f42396b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(UserRepository userRepository, int i10) {
        super(1);
        this.f42395a = i10;
        this.f42396b = userRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f42395a;
        UserRepository userRepository = this.f42396b;
        switch (i11) {
            case 0:
                if (Intrinsics.a(((LeaderBoardUserDto) obj).getUserId(), userRepository.getCurrentUserId())) {
                    i10 = R.color.playerOverlayColor;
                } else {
                    i10 = android.R.color.transparent;
                }
                return Integer.valueOf(i10);
            default:
                LeaderBoardUserDto leaderBoardUserDto = (LeaderBoardUserDto) obj;
                if (Intrinsics.a(leaderBoardUserDto.getUserId(), userRepository.getCurrentUserId())) {
                    return jr.h.r(leaderBoardUserDto.getName(), " (You)");
                }
                return leaderBoardUserDto.getName();
        }
    }
}
