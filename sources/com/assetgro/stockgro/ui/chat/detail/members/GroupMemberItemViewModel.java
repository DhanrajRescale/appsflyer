package com.assetgro.stockgro.ui.chat.detail.members;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import vd.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/members/GroupMemberItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/GroupMember;", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupMemberItemViewModel extends BaseItemViewModel<GroupMember> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9278g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9279h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9280i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f9281j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f9282k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMemberItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9278g = i0.C(this.f9075c, i.f37978b);
        this.f9279h = i0.C(this.f9075c, i.f37981e);
        this.f9280i = i0.C(this.f9075c, i.f37982f);
        this.f9281j = i0.C(this.f9075c, i.f37979c);
        this.f9282k = i0.C(this.f9075c, i.f37980d);
    }
}
