package qe;

import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import ba.v3;
import com.assetgro.stockgro.data.remote.response.SearchGroupsData;
import com.assetgro.stockgro.data.remote.response.SearchGroupsItem;
import com.assetgro.stockgro.data.remote.response.SearchUsersData;
import com.assetgro.stockgro.data.remote.response.SearchUsersItem;
import com.assetgro.stockgro.data.remote.response.SocialSearchHistoryItem;
import com.assetgro.stockgro.data.remote.response.SocialSearchResponseDto;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailActivity;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import iu.k;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialAdvancedSearchActivity f31901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SocialAdvancedSearchActivity socialAdvancedSearchActivity, int i10) {
        super(1);
        this.f31900a = i10;
        this.f31901b = socialAdvancedSearchActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f31900a;
        int i11 = 8;
        SocialAdvancedSearchActivity socialAdvancedSearchActivity = this.f31901b;
        switch (i10) {
            case 0:
                v3 v3Var = (v3) socialAdvancedSearchActivity.w();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i11 = 0;
                }
                v3Var.f6376w.setVisibility(i11);
                return;
            default:
                v3 v3Var2 = (v3) socialAdvancedSearchActivity.w();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i11 = 0;
                }
                v3Var2.f6377x.setVisibility(i11);
                return;
        }
    }

    public final void d(Integer num) {
        int i10 = this.f31900a;
        SocialAdvancedSearchActivity socialAdvancedSearchActivity = this.f31901b;
        switch (i10) {
            case 4:
                List p10 = socialAdvancedSearchActivity.K().p();
                Intrinsics.c(num);
                ((SearchGroupsItem) p10.get(num.intValue())).setHasJoinedGroup(true);
                socialAdvancedSearchActivity.K().e(num.intValue());
                return;
            default:
                List p11 = socialAdvancedSearchActivity.L().p();
                Intrinsics.c(num);
                ((SearchUsersItem) p11.get(num.intValue())).setFollowing(true);
                socialAdvancedSearchActivity.L().e(num.intValue());
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<SearchGroupsItem> list;
        List<SearchUsersItem> list2;
        List<SearchUsersItem> list3;
        List<SearchGroupsItem> list4;
        List<SearchUsersItem> list5;
        int i10;
        int i11;
        int i12;
        List<SearchUsersItem> list6;
        List<SearchGroupsItem> groups;
        Class cls;
        int i13 = this.f31900a;
        int i14 = 8;
        int i15 = 0;
        int i16 = 2;
        List<SearchGroupsItem> list7 = null;
        Integer num = null;
        Integer num2 = null;
        SocialAdvancedSearchActivity socialAdvancedSearchActivity = this.f31901b;
        switch (i13) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                List list8 = (List) obj;
                if (list8 != null && !list8.isEmpty()) {
                    ((v3) socialAdvancedSearchActivity.w()).f6377x.setVisibility(0);
                    ((v3) socialAdvancedSearchActivity.w()).f6372s.setVisibility(8);
                    se.d dVar = socialAdvancedSearchActivity.f9424k;
                    if (dVar != null) {
                        dVar.u(list8);
                    } else {
                        Intrinsics.k("searchHistoryAdapter");
                        throw null;
                    }
                } else {
                    ((v3) socialAdvancedSearchActivity.w()).f6377x.setVisibility(8);
                    ((v3) socialAdvancedSearchActivity.w()).f6372s.setVisibility(0);
                }
                return Unit.f23355a;
            case 2:
                SocialSearchResponseDto socialSearchResponseDto = (SocialSearchResponseDto) obj;
                SearchGroupsData groupsData = socialSearchResponseDto.getGroupsData();
                if (groupsData != null) {
                    list = groupsData.getGroups();
                } else {
                    list = null;
                }
                int i17 = 1;
                if (list == null || list.isEmpty()) {
                    SearchUsersData usersData = socialSearchResponseDto.getUsersData();
                    if (usersData != null) {
                        list2 = usersData.getUsers();
                    } else {
                        list2 = null;
                    }
                    if (list2 == null || list2.isEmpty()) {
                        ((v3) socialAdvancedSearchActivity.w()).f6374u.setVisibility(0);
                        ((v3) socialAdvancedSearchActivity.w()).f6377x.setVisibility(8);
                        ((v3) socialAdvancedSearchActivity.w()).f6372s.setVisibility(8);
                        v3 v3Var = (v3) socialAdvancedSearchActivity.w();
                        if (((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9435u == e.f31904b) {
                            i15 = 8;
                        }
                        v3Var.f6379z.setVisibility(i15);
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.f4876z.setVisibility(8);
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.B.setVisibility(8);
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.f4874x.setVisibility(8);
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.f4875y.setVisibility(8);
                        int ordinal = ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9435u.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    v3 v3Var2 = (v3) socialAdvancedSearchActivity.w();
                                    String string = socialAdvancedSearchActivity.getString(R.string.text_no_search_results_groups);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    v3Var2.A.setText(a3.a.m(new Object[]{((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9436v}, 1, string, "format(...)"));
                                }
                            } else {
                                v3 v3Var3 = (v3) socialAdvancedSearchActivity.w();
                                String string2 = socialAdvancedSearchActivity.getString(R.string.text_no_search_results_people);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                v3Var3.A.setText(a3.a.m(new Object[]{((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9436v}, 1, string2, "format(...)"));
                            }
                        } else {
                            v3 v3Var4 = (v3) socialAdvancedSearchActivity.w();
                            String string3 = socialAdvancedSearchActivity.getString(R.string.text_no_search_results_all);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            v3Var4.A.setText(a3.a.m(new Object[]{((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9436v}, 1, string3, "format(...)"));
                        }
                        return Unit.f23355a;
                    }
                }
                ((v3) socialAdvancedSearchActivity.w()).f6374u.setVisibility(8);
                ((v3) socialAdvancedSearchActivity.w()).f6377x.setVisibility(8);
                ((v3) socialAdvancedSearchActivity.w()).f6372s.setVisibility(8);
                ((v3) socialAdvancedSearchActivity.w()).f6379z.setVisibility(0);
                int ordinal2 = ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9435u.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            socialAdvancedSearchActivity.M();
                            SearchGroupsData groupsData2 = socialSearchResponseDto.getGroupsData();
                            if (groupsData2 != null) {
                                groupsData2.getGroups();
                            }
                            SearchGroupsData groupsData3 = socialSearchResponseDto.getGroupsData();
                            if (groupsData3 != null) {
                                num = Integer.valueOf(groupsData3.getTotalGroupCount());
                            }
                            String valueOf = String.valueOf(num);
                            TextView textView = ((v3) socialAdvancedSearchActivity.w()).f6373t.f4872v;
                            String string4 = socialAdvancedSearchActivity.getString(R.string.text_label_search_results_groups);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            String format = String.format(string4, Arrays.copyOf(new Object[]{valueOf, ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9436v}, 2));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            textView.setText(format);
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.A.setAdapter(socialAdvancedSearchActivity.K());
                            SearchGroupsData groupsData4 = socialSearchResponseDto.getGroupsData();
                            if (groupsData4 != null && (groups = groupsData4.getGroups()) != null) {
                                socialAdvancedSearchActivity.O(groups);
                            }
                        }
                    } else {
                        socialAdvancedSearchActivity.M();
                        SearchUsersData usersData2 = socialSearchResponseDto.getUsersData();
                        if (usersData2 != null) {
                            list6 = usersData2.getUsers();
                        } else {
                            list6 = null;
                        }
                        SearchUsersData usersData3 = socialSearchResponseDto.getUsersData();
                        if (usersData3 != null) {
                            num2 = Integer.valueOf(usersData3.getTotalUserCount());
                        }
                        String valueOf2 = String.valueOf(num2);
                        TextView textView2 = ((v3) socialAdvancedSearchActivity.w()).f6373t.f4872v;
                        String string5 = socialAdvancedSearchActivity.getString(R.string.text_label_search_results_people);
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        String format2 = String.format(string5, Arrays.copyOf(new Object[]{valueOf2, ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9436v}, 2));
                        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                        textView2.setText(format2);
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.A.setAdapter(socialAdvancedSearchActivity.L());
                        if (list6 != null) {
                            socialAdvancedSearchActivity.P(list6);
                        }
                    }
                } else {
                    SearchUsersData usersData4 = socialSearchResponseDto.getUsersData();
                    if (usersData4 != null) {
                        list3 = usersData4.getUsers();
                    } else {
                        list3 = null;
                    }
                    SearchGroupsData groupsData5 = socialSearchResponseDto.getGroupsData();
                    if (groupsData5 != null) {
                        list4 = groupsData5.getGroups();
                    } else {
                        list4 = null;
                    }
                    SearchUsersData usersData5 = socialSearchResponseDto.getUsersData();
                    if (usersData5 != null) {
                        list5 = usersData5.getUsers();
                    } else {
                        list5 = null;
                    }
                    if (list5 != null && !list5.isEmpty()) {
                        i10 = false;
                    } else {
                        i10 = true;
                    }
                    int i18 = i10 ^ true;
                    SearchGroupsData groupsData6 = socialSearchResponseDto.getGroupsData();
                    if (groupsData6 != null) {
                        list7 = groupsData6.getGroups();
                    }
                    if (list7 != null && !list7.isEmpty()) {
                        i11 = false;
                    } else {
                        i11 = true;
                    }
                    int i19 = i11 ^ true;
                    if (i18 != false) {
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.f4876z.setVisibility(0);
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.f4872v.setText(socialAdvancedSearchActivity.getString(R.string.text_people));
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.A.setAdapter(socialAdvancedSearchActivity.L());
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.G.setOnClickListener(new b(socialAdvancedSearchActivity, i17));
                        SearchUsersData usersData6 = socialSearchResponseDto.getUsersData();
                        if (usersData6 != null) {
                            boolean moreUsersPresent = usersData6.getMoreUsersPresent();
                            TextView textView3 = ((v3) socialAdvancedSearchActivity.w()).f6373t.G;
                            if (moreUsersPresent) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            textView3.setVisibility(i12);
                        }
                        if (list3 != null) {
                            socialAdvancedSearchActivity.P(list3);
                        }
                    }
                    if (i19 != false) {
                        if (i18 != false) {
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.B.setVisibility(0);
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.C.setVisibility(0);
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.f4875y.setVisibility(8);
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.f4873w.setText(socialAdvancedSearchActivity.getString(R.string.text_groups));
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.D.setAdapter(socialAdvancedSearchActivity.K());
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.H.setOnClickListener(new b(socialAdvancedSearchActivity, i16));
                            SearchGroupsData groupsData7 = socialSearchResponseDto.getGroupsData();
                            if (groupsData7 != null) {
                                boolean moreGroupsPresent = groupsData7.getMoreGroupsPresent();
                                TextView textView4 = ((v3) socialAdvancedSearchActivity.w()).f6373t.H;
                                if (moreGroupsPresent) {
                                    i14 = 0;
                                }
                                textView4.setVisibility(i14);
                            }
                        } else {
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.f4876z.setVisibility(0);
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.B.setVisibility(0);
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.C.setVisibility(8);
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.f4875y.setVisibility(0);
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.f4872v.setText(socialAdvancedSearchActivity.getString(R.string.text_groups));
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.f4873w.setText(socialAdvancedSearchActivity.getString(R.string.text_people));
                            TextView textView5 = ((v3) socialAdvancedSearchActivity.w()).f6373t.F;
                            String string6 = socialAdvancedSearchActivity.getString(R.string.text_no_search_results_people);
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                            String format3 = String.format(string6, Arrays.copyOf(new Object[]{((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9436v}, 1));
                            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                            textView5.setText(format3);
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.A.setAdapter(socialAdvancedSearchActivity.K());
                            ((v3) socialAdvancedSearchActivity.w()).f6373t.G.setOnClickListener(new b(socialAdvancedSearchActivity, 3));
                            SearchGroupsData groupsData8 = socialSearchResponseDto.getGroupsData();
                            if (groupsData8 != null) {
                                boolean moreGroupsPresent2 = groupsData8.getMoreGroupsPresent();
                                TextView textView6 = ((v3) socialAdvancedSearchActivity.w()).f6373t.G;
                                if (moreGroupsPresent2) {
                                    i14 = 0;
                                }
                                textView6.setVisibility(i14);
                            }
                        }
                        if (list4 != null) {
                            socialAdvancedSearchActivity.O(list4);
                        }
                    } else {
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.B.setVisibility(0);
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.C.setVisibility(8);
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.f4875y.setVisibility(0);
                        ((v3) socialAdvancedSearchActivity.w()).f6373t.f4873w.setText(socialAdvancedSearchActivity.getString(R.string.text_groups));
                        TextView textView7 = ((v3) socialAdvancedSearchActivity.w()).f6373t.F;
                        String string7 = socialAdvancedSearchActivity.getString(R.string.text_no_search_results_groups);
                        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                        String format4 = String.format(string7, Arrays.copyOf(new Object[]{((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9436v}, 1));
                        Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
                        textView7.setText(format4);
                    }
                }
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                d((Integer) obj);
                return Unit.f23355a;
            case 5:
                d((Integer) obj);
                return Unit.f23355a;
            case 6:
                String searchString = (String) obj;
                if (searchString != null && searchString.length() > 2) {
                    socialAdvancedSearchActivity.getClass();
                    Intrinsics.checkNotNullParameter(searchString, "searchString");
                    SocialAdvancedSearchViewModel socialAdvancedSearchViewModel = (SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x();
                    Intrinsics.checkNotNullParameter(searchString, "<set-?>");
                    socialAdvancedSearchViewModel.f9436v = searchString;
                    SocialAdvancedSearchViewModel socialAdvancedSearchViewModel2 = (SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x();
                    socialAdvancedSearchViewModel2.f9437w = false;
                    socialAdvancedSearchViewModel2.f9438x = 0;
                    socialAdvancedSearchViewModel2.f9439y = 10;
                    ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).i();
                    ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9084g.postValue(Boolean.TRUE);
                }
                return Unit.f23355a;
            case 7:
                SocialSearchHistoryItem it = (SocialSearchHistoryItem) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String searchQuery = it.getSearchQuery();
                Menu menu = socialAdvancedSearchActivity.f9427n;
                if (menu != null) {
                    View actionView = menu.findItem(R.id.action_search).getActionView();
                    Intrinsics.d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
                    SearchView searchView = (SearchView) actionView;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f1048p;
                    searchAutoComplete.setText(searchQuery);
                    if (searchQuery != null) {
                        searchAutoComplete.setSelection(searchAutoComplete.length());
                        searchView.f1053r0 = searchQuery;
                    }
                    if (!TextUtils.isEmpty(searchQuery)) {
                        searchView.s();
                    }
                    return Unit.f23355a;
                }
                Intrinsics.k("toolbarMenu");
                throw null;
            case 8:
                SearchGroupsItem chatGroup = (SearchGroupsItem) obj;
                Intrinsics.checkNotNullParameter(chatGroup, "it");
                socialAdvancedSearchActivity.getClass();
                Intrinsics.checkNotNullParameter(chatGroup, "chatGroup");
                if (chatGroup.getHasJoinedGroup()) {
                    Intent intent = new Intent(socialAdvancedSearchActivity, (Class<?>) GroupDetailHostActivity.class);
                    intent.putExtra("GROUP_CHAT_ID", chatGroup.getGroupId());
                    socialAdvancedSearchActivity.startActivity(intent);
                } else {
                    String groupId = chatGroup.getGroupId();
                    if (groupId != null) {
                        Intent intent2 = new Intent(socialAdvancedSearchActivity, (Class<?>) GroupDetailActivity.class);
                        intent2.putExtra("GROUP_CHAT_ID", groupId);
                        socialAdvancedSearchActivity.startActivity(intent2);
                    }
                }
                return Unit.f23355a;
            default:
                SearchUsersItem it2 = (SearchUsersItem) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                SocialAdvancedSearchViewModel socialAdvancedSearchViewModel3 = (SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x();
                String userId = it2.getUserId();
                Intrinsics.checkNotNullParameter(userId, "userId");
                if (!Intrinsics.a(userId, socialAdvancedSearchViewModel3.f9081d.getCurrentUserId())) {
                    if (it2.isExpert()) {
                        cls = RiaProfileActivity.class;
                    } else {
                        cls = UserProfileActivity.class;
                    }
                    Intent intent3 = new Intent(socialAdvancedSearchActivity, (Class<?>) cls);
                    intent3.putExtra("USER_IDENTIFIER", it2.getUserId());
                    intent3.putExtra("USER_NAME", it2.getUserDisplayName());
                    socialAdvancedSearchActivity.startActivity(intent3);
                } else {
                    socialAdvancedSearchActivity.startActivity(new Intent(socialAdvancedSearchActivity, (Class<?>) MyProfileActivity.class));
                }
                return Unit.f23355a;
        }
    }
}
