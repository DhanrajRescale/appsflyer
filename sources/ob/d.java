package ob;

import android.content.Context;
import android.content.Intent;
import com.assetgro.stockgro.feature_social.presentation.feed.details.FeedPostStreamDetailActivity;
import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamHostActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.l3;
import ut.n;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f29885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialHomeFeedV2ViewModel f29886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f29887c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f29888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l3 l3Var, SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel, Context context, l3 l3Var2, yt.a aVar) {
        super(2, aVar);
        this.f29885a = l3Var;
        this.f29886b = socialHomeFeedV2ViewModel;
        this.f29887c = context;
        this.f29888d = l3Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f29885a, this.f29886b, this.f29887c, this.f29888d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        nb.h hVar = (nb.h) this.f29885a.getValue();
        if (hVar instanceof nb.d) {
            nb.b bVar = nb.b.f28564a;
            this.f29886b.j(new nb.j());
        } else if (!(hVar instanceof nb.e)) {
            boolean z10 = hVar instanceof nb.f;
            Context context = this.f29887c;
            if (z10) {
                Intent intent = new Intent(context, (Class<?>) FeedStreamHostActivity.class);
                nb.f fVar = (nb.f) hVar;
                intent.putExtras(hl.f.y(new Pair("FEED_STREAM_TYPE", fVar.f28577a), new Pair("FEED_STREAM_ENTITY_ID", fVar.f28578b)));
                context.startActivity(intent);
            } else if (hVar instanceof nb.g) {
                Intent intent2 = new Intent(context, (Class<?>) FeedPostStreamDetailActivity.class);
                nb.g gVar = (nb.g) hVar;
                intent2.putExtras(hl.f.y(new Pair("POST_ID", gVar.f28579a), new Pair("GROUP_CHAT_ID", gVar.f28580b), new Pair("FEED_STREAM_TYPE", gVar.f28581c)));
                context.startActivity(intent2);
            }
        }
        return Unit.f23355a;
    }
}
