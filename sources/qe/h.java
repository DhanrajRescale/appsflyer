package qe;

import com.assetgro.stockgro.data.remote.response.SearchGroupsData;
import com.assetgro.stockgro.data.remote.response.SearchUsersData;
import com.assetgro.stockgro.data.remote.response.SocialSearchResponseDto;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f31915b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f31916c = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f31917a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f31917a;
        switch (i10) {
            case 0:
                SocialSearchResponseDto socialSearchResponseDto = (SocialSearchResponseDto) obj;
                switch (i10) {
                    case 0:
                        SearchGroupsData groupsData = socialSearchResponseDto.getGroupsData();
                        if (groupsData == null) {
                            return null;
                        }
                        return groupsData.getGroups();
                    default:
                        SearchUsersData usersData = socialSearchResponseDto.getUsersData();
                        if (usersData == null) {
                            return null;
                        }
                        return usersData.getUsers();
                }
            default:
                SocialSearchResponseDto socialSearchResponseDto2 = (SocialSearchResponseDto) obj;
                switch (i10) {
                    case 0:
                        SearchGroupsData groupsData2 = socialSearchResponseDto2.getGroupsData();
                        if (groupsData2 == null) {
                            return null;
                        }
                        return groupsData2.getGroups();
                    default:
                        SearchUsersData usersData2 = socialSearchResponseDto2.getUsersData();
                        if (usersData2 == null) {
                            return null;
                        }
                        return usersData2.getUsers();
                }
        }
    }
}
