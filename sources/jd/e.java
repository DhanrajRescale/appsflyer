package jd;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.RogueUserDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListViewModel;
import iu.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.z;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeactivatedMembersListViewModel f21312b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(DeactivatedMembersListViewModel deactivatedMembersListViewModel, int i10) {
        super(1);
        this.f21311a = i10;
        this.f21312b = deactivatedMembersListViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<RogueUserDto> list;
        int i10 = this.f21311a;
        DeactivatedMembersListViewModel deactivatedMembersListViewModel = this.f21312b;
        switch (i10) {
            case 0:
                Group group = (Group) obj;
                deactivatedMembersListViewModel.f9084g.postValue(Boolean.FALSE);
                if (group != null) {
                    deactivatedMembersListViewModel.f9109q.postValue(group);
                }
                return Unit.f23355a;
            case 1:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 1:
                        deactivatedMembersListViewModel.f9084g.postValue(Boolean.FALSE);
                        th2.printStackTrace();
                        break;
                    default:
                        deactivatedMembersListViewModel.f9084g.postValue(Boolean.FALSE);
                        th2.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            case 2:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                deactivatedMembersListViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto != null && (list = (List) baseResponseDto.getData()) != null) {
                    ArrayList arrayList = new ArrayList(z.k(list));
                    for (RogueUserDto rogueUserDto : list) {
                        String uuid = rogueUserDto.getUuid();
                        Intrinsics.c(uuid);
                        String name = rogueUserDto.getName();
                        Intrinsics.c(name);
                        arrayList.add(new GroupMember(HttpUrl.FRAGMENT_ENCODE_SET, uuid, HttpUrl.FRAGMENT_ENCODE_SET, name, HttpUrl.FRAGMENT_ENCODE_SET, rogueUserDto.getChatRole(), null, false, false, 448, null));
                    }
                    deactivatedMembersListViewModel.f9107o.postValue(arrayList);
                }
                return Unit.f23355a;
            default:
                Throwable th3 = (Throwable) obj;
                switch (i10) {
                    case 1:
                        deactivatedMembersListViewModel.f9084g.postValue(Boolean.FALSE);
                        th3.printStackTrace();
                        break;
                    default:
                        deactivatedMembersListViewModel.f9084g.postValue(Boolean.FALSE);
                        th3.printStackTrace();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
