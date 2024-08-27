package com.assetgro.stockgro.ui.drawer.invite;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.model.RedirectConfig;
import com.assetgro.stockgro.data.model.TemplateParams;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ge.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import okhttp3.HttpUrl;
import pj.a;
import ub.f;
import ye.c;
import ye.d;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/invite/InviteViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class InviteViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final e0 f9488n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9489o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9490p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9491q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public InviteViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        InviteTemplateDto inviteTemplateDto;
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        String currentUserId = this.f9081d.getCurrentUserId();
        if (currentUserId != null) {
            inviteTemplateDto = new InviteTemplateDto("new_user_invite", new TemplateParams(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET), Boolean.TRUE, new RedirectConfig(HttpUrl.FRAGMENT_ENCODE_SET, currentUserId, "appsflyer", null));
        } else {
            inviteTemplateDto = null;
        }
        this.f9084g.postValue(Boolean.TRUE);
        g.H(u0.f(this), null, null, new d(this, inviteTemplateDto, null), 3);
        h c10 = this.f9081d.getInvitedFriends().c(((e) this.f9079b).J());
        jt.d dVar = new jt.d(new q(11, new f(this, 16)), new q(12, c.f41601b));
        c10.a(dVar);
        this.f9080c.c(dVar);
        this.f9488n = new LiveData();
        ?? liveData = new LiveData();
        this.f9489o = liveData;
        this.f9490p = liveData;
        this.f9491q = new LiveData();
    }
}
