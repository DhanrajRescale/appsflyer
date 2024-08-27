package zd;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import ba.fb;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.PinnedMessagesItemViewModel;
import com.assetgro.stockgro.ui.chat.utils.MediaPlayerActivity;
import com.assetgro.stockgro.ui.chat.utils.PhotoViewerActivity;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import hv.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f42427b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, int i10) {
        super(1);
        this.f42426a = i10;
        this.f42427b = mVar;
    }

    public final void a(ChatMessage it) {
        int i10 = this.f42426a;
        m mVar = this.f42427b;
        switch (i10) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                mVar.f42432x.invoke(it);
                View view = mVar.f22629a;
                view.setBackgroundColor(r3.k.getColor(view.getContext(), R.color.social_background_light));
                return;
            default:
                Long serverTime = it.getServerTime();
                if (serverTime != null) {
                    long longValue = serverTime.longValue();
                    TextView textView = ((fb) mVar.f17291u).f4698v;
                    String a10 = jv.a.b("dd MMM | HH:mm").a(hv.g.v(hv.e.n(longValue / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), q.p()));
                    Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
                    textView.setText(a10);
                }
                ue.h hVar = mVar.f42434z;
                if (hVar != null) {
                    View view2 = ((fb) mVar.f17291u).f27491e;
                    String currentUserId = ((PinnedMessagesItemViewModel) mVar.v()).f9314g.getCurrentUserId();
                    Intrinsics.c(view2);
                    hVar.h(it, view2, k.f42428a, new j(mVar, 1), new j(mVar, 2), l.f42429b, new j(mVar, 3), currentUserId, true);
                    return;
                }
                Intrinsics.k("chatMessageViewManager");
                throw null;
        }
    }

    public final void d(String url) {
        int i10 = this.f42426a;
        m mVar = this.f42427b;
        switch (i10) {
            case 0:
                ((fb) mVar.f17291u).f4696t.setText(url);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(url, "url");
                Intent intent = new Intent(mVar.f22629a.getContext(), (Class<?>) PhotoViewerActivity.class);
                intent.putExtra("url", url);
                intent.putExtra("type", "image");
                mVar.f22629a.getContext().startActivity(intent);
                return;
            default:
                Intrinsics.checkNotNullParameter(url, "url");
                Context context = mVar.f22629a.getContext();
                if (context != null) {
                    Intent intent2 = new Intent(context, (Class<?>) MediaPlayerActivity.class);
                    intent2.putExtra("url", url);
                    context.startActivity(intent2);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f42426a) {
            case 0:
                d((String) obj);
                return Unit.f23355a;
            case 1:
                d((String) obj);
                return Unit.f23355a;
            case 2:
                d((String) obj);
                return Unit.f23355a;
            case 3:
                a((ChatMessage) obj);
                return Unit.f23355a;
            default:
                a((ChatMessage) obj);
                return Unit.f23355a;
        }
    }
}
