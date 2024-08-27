package ie;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatHostViewModel f19901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GroupChatHostViewModel groupChatHostViewModel, int i10) {
        super(1);
        this.f19900a = i10;
        this.f19901b = groupChatHostViewModel;
    }

    public final String a(Group group) {
        String type;
        int i10 = this.f19900a;
        GroupChatHostViewModel groupChatHostViewModel = this.f19901b;
        switch (i10) {
            case 3:
                groupChatHostViewModel.getClass();
                if (group != null && (type = group.getType()) != null) {
                    if (!type.equals("Support") && !type.equals("1on1")) {
                        return group.getDisplayImageUrl();
                    }
                    return group.getFriendImageURL();
                }
                if (group != null) {
                    return group.getDisplayImageUrl();
                }
                return null;
            default:
                groupChatHostViewModel.getClass();
                return GroupChatHostViewModel.k(group);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        GroupChatHostViewModel groupChatHostViewModel = this.f19901b;
        int i11 = this.f19900a;
        switch (i11) {
            case 0:
                Throwable th2 = (Throwable) obj;
                switch (i11) {
                    case 0:
                        groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
                        th2.printStackTrace();
                        break;
                    default:
                        groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
                        th2.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            case 1:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
                String errorCode = baseResponseDto.getErrorCode();
                if (errorCode != null && errorCode.length() != 0 && Intrinsics.a(baseResponseDto.getErrorCode(), "111")) {
                    groupChatHostViewModel.f9376u.postValue(new kj.j(baseResponseDto.getMessage()));
                } else {
                    Group group = (Group) baseResponseDto.getData();
                    if (group != null) {
                        groupChatHostViewModel.f9372q.postValue(group);
                    }
                }
                Group group2 = (Group) baseResponseDto.getData();
                if (group2 != null) {
                    if (group2.getIsFeedEnabled() && !group2.getIsChatDisabled()) {
                        groupChatHostViewModel.f9375t.postValue(new kj.j(Unit.f23355a));
                        String groupLanding = group2.getGroupLanding();
                        if (groupLanding != null) {
                            if (Intrinsics.a(groupLanding, "GROUP_CHAT")) {
                                i10 = 1;
                            } else {
                                i10 = groupChatHostViewModel.K;
                            }
                        } else {
                            i10 = groupChatHostViewModel.K;
                        }
                        groupChatHostViewModel.J = i10;
                    } else {
                        groupChatHostViewModel.K = 0;
                        if (group2.getIsChatDisabled()) {
                            groupChatHostViewModel.f9373r.postValue(new kj.j(Unit.f23355a));
                        } else {
                            groupChatHostViewModel.f9374s.postValue(new kj.j(Unit.f23355a));
                        }
                    }
                }
                return Unit.f23355a;
            case 2:
                Throwable th3 = (Throwable) obj;
                switch (i11) {
                    case 0:
                        groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
                        th3.printStackTrace();
                        break;
                    default:
                        groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
                        th3.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            case 3:
                return a((Group) obj);
            default:
                return a((Group) obj);
        }
    }
}
