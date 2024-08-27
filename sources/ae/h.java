package ae;

import android.content.Intent;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.Sticker;
import com.assetgro.stockgro.ui.chat.utils.PhotoViewerActivity;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f388a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, ChatMessage chatMessage) {
        super(1);
        this.f389b = jVar;
        this.f390c = chatMessage;
    }

    public final void a(String url) {
        Sticker sticker;
        String sticker_id;
        int i10 = this.f388a;
        ChatMessage chatMessage = this.f390c;
        j jVar = this.f389b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(url, "url");
                Media media = chatMessage.getMedia();
                if (media == null || (sticker = media.getSticker()) == null || (sticker_id = sticker.getSticker_id()) == null || sticker_id.length() <= 0) {
                    Intent intent = new Intent(jVar.f22629a.getContext(), (Class<?>) PhotoViewerActivity.class);
                    intent.putExtra("url", url);
                    intent.putExtra("type", "image");
                    jVar.f22629a.getContext().startActivity(intent);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(url, "it");
                jVar.f395z.invoke(chatMessage);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f388a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ChatMessage chatMessage, j jVar) {
        super(1);
        this.f390c = chatMessage;
        this.f389b = jVar;
    }
}
