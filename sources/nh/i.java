package nh;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.d1;
import ba.ar;
import ba.p4;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.ProfileStatsDto;
import com.assetgro.stockgro.data.model.UserReportStatusDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.profile.UserProfileSharedViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import com.google.android.material.button.MaterialButton;
import ie.p;
import kh.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserProfileActivity f28709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(UserProfileActivity userProfileActivity, int i10) {
        super(1);
        this.f28708a = i10;
        this.f28709b = userProfileActivity;
    }

    public final void a(Boolean bool) {
        com.kaopiz.kprogresshud.f fVar;
        String str;
        int i10 = this.f28708a;
        UserProfileActivity userProfileActivity = this.f28709b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = userProfileActivity.f17255c;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = userProfileActivity.f17255c) != null) {
                    fVar.b();
                    return;
                }
                return;
            default:
                Intrinsics.c(bool);
                userProfileActivity.f10066l = bool.booleanValue();
                userProfileActivity.invalidateOptionsMenu();
                if (bool.booleanValue()) {
                    d1 supportFragmentManager = userProfileActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
                    int i11 = y.f23187n;
                    String str2 = ((UserProfileViewModel) userProfileActivity.x()).f10079w;
                    if (str2 == null) {
                        str2 = ((UserProfileViewModel) userProfileActivity.x()).h();
                    }
                    Intent intent = userProfileActivity.getIntent();
                    if (intent != null) {
                        str = intent.getStringExtra("USER_NAME");
                    } else {
                        str = null;
                    }
                    aVar.f(R.id.container_fragment, yk.g.K(str2, str, userProfileActivity.f10068n), "UserStatisticsFragment");
                    aVar.h(false);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view;
        TextView textView;
        MaterialButton materialButton;
        int i10 = this.f28708a;
        String str = null;
        MaterialButton materialButton2 = null;
        UserProfileActivity userProfileActivity = this.f28709b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                Group group = (Group) obj;
                Intrinsics.c(group);
                userProfileActivity.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                Intent intent = new Intent(userProfileActivity, (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", group.getGroupId());
                userProfileActivity.startActivity(intent);
                return Unit.f23355a;
            case 2:
                ProfileStatsDto profileStatsDto = (ProfileStatsDto) obj;
                Intent intent2 = userProfileActivity.getIntent();
                if (intent2 != null && !intent2.getBooleanExtra("CALL_FROM_CHAT", false)) {
                    ((p4) userProfileActivity.w()).f5719t.setVisibility(0);
                }
                userProfileActivity.f10068n = profileStatsDto.isFriend();
                d1 supportFragmentManager = userProfileActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
                int i11 = y.f23187n;
                String str2 = ((UserProfileViewModel) userProfileActivity.x()).f10079w;
                if (str2 == null) {
                    str2 = ((UserProfileViewModel) userProfileActivity.x()).h();
                }
                Intent intent3 = userProfileActivity.getIntent();
                if (intent3 != null) {
                    str = intent3.getStringExtra("USER_NAME");
                }
                aVar.e(R.id.container_fragment, yk.g.K(str2, str, profileStatsDto.isFriend()), "UserStatisticsFragment", 1);
                aVar.h(false);
                return Unit.f23355a;
            case 3:
                UserReportStatusDto userReportStatusDto = (UserReportStatusDto) obj;
                UserProfileSharedViewModel userProfileSharedViewModel = userProfileActivity.f10069o;
                if (userProfileSharedViewModel != null) {
                    userProfileSharedViewModel.f9976n.postValue(userReportStatusDto);
                    return Unit.f23355a;
                }
                Intrinsics.k("userProfileSharedViewModel");
                throw null;
            case 4:
                String str3 = (String) obj;
                Intrinsics.c(str3);
                int i12 = UserProfileActivity.f10064p;
                userProfileActivity.getClass();
                LayoutInflater from = LayoutInflater.from(userProfileActivity);
                int i13 = ar.f4226u;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                ar arVar = (ar) m4.m.g(from, R.layout.layout_custom_dialog_single_choice, null, false, null);
                h.j create = new h.i(userProfileActivity, R.style.StockgroDialogTheme).create();
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                if (arVar != null) {
                    view = arVar.f27491e;
                } else {
                    view = null;
                }
                h.h hVar = create.f17699f;
                hVar.f17674h = view;
                hVar.f17675i = 0;
                hVar.f17676j = false;
                create.setCancelable(true);
                create.setCanceledOnTouchOutside(false);
                Window window = create.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                create.show();
                if (arVar != null) {
                    textView = arVar.f4228t;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    textView.setText(str3);
                }
                if (arVar != null) {
                    materialButton2 = arVar.f4227s;
                }
                if (materialButton2 != null) {
                    materialButton2.setText(userProfileActivity.getString(R.string.ok));
                }
                if (arVar != null && (materialButton = arVar.f4227s) != null) {
                    materialButton.setOnClickListener(new p(create, 2));
                }
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
