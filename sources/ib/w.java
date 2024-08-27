package ib;

import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiaProfileActivity f19830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComposeView f19831c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(RiaProfileActivity riaProfileActivity, ComposeView composeView, int i10) {
        super(1);
        this.f19829a = i10;
        this.f19830b = riaProfileActivity;
        this.f19831c = composeView;
    }

    public final void a(String groupId) {
        int i10 = this.f19829a;
        RiaProfileActivity riaProfileActivity = this.f19830b;
        ComposeView composeView = this.f19831c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intent intent = new Intent(composeView.getContext(), (Class<?>) GroupDetailActivity.class);
                intent.putExtras(hl.f.y(new Pair("GROUP_CHAT_ID", groupId)));
                riaProfileActivity.startActivity(intent);
                return;
            default:
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intent intent2 = new Intent(composeView.getContext(), (Class<?>) GroupDetailActivity.class);
                intent2.putExtras(hl.f.y(new Pair("GROUP_CHAT_ID", groupId)));
                riaProfileActivity.startActivity(intent2);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f19829a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
