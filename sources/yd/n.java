package yd;

import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Media;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f41567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f41568c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd.m f41569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(ChatMessage chatMessage, r rVar, rd.m mVar, int i10) {
        super(1);
        this.f41566a = i10;
        this.f41567b = chatMessage;
        this.f41568c = rVar;
        this.f41569d = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String url;
        String url2;
        int i10 = this.f41566a;
        rd.m mVar = this.f41569d;
        r rVar = this.f41568c;
        ChatMessage chatMessage = this.f41567b;
        switch (i10) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Media media = chatMessage.getMedia();
                if (media != null && (url = media.getUrl()) != null) {
                    r.p(rVar, chatMessage.getMedia().getFile_name(), url, mVar);
                }
                return Unit.f23355a;
            default:
                ChatMessage it2 = (ChatMessage) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Media media2 = chatMessage.getMedia();
                if (media2 != null && (url2 = media2.getUrl()) != null) {
                    r.p(rVar, chatMessage.getMedia().getFile_name(), url2, mVar);
                }
                return Unit.f23355a;
        }
    }
}
