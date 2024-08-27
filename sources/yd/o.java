package yd;

import com.assetgro.stockgro.data.model.ChatMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f41571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rd.m f41572c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f41573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, rd.m mVar, ChatMessage chatMessage, int i10, int i11) {
        super(1);
        this.f41570a = i11;
        this.f41571b = rVar;
        this.f41572c = mVar;
        this.f41573d = chatMessage;
        this.f41574e = i10;
    }

    public final void a(ChatMessage it) {
        int i10 = this.f41570a;
        rd.m mVar = this.f41572c;
        r rVar = this.f41571b;
        int i11 = this.f41574e;
        ChatMessage chatMessage = this.f41573d;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                rVar.v(i11, chatMessage, mVar);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                rVar.v(i11, chatMessage, mVar);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                rVar.v(i11, chatMessage, mVar);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                rVar.v(i11, chatMessage, mVar);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41570a) {
            case 0:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 1:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 2:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 3:
                Intrinsics.checkNotNullParameter((String) obj, "<anonymous parameter 0>");
                r rVar = this.f41571b;
                int size = rVar.f41589h.size();
                ChatMessage chatMessage = this.f41573d;
                rd.m mVar = this.f41572c;
                if (size > 0) {
                    rVar.v(this.f41574e, chatMessage, mVar);
                } else if (mVar != null) {
                    mVar.d(chatMessage);
                }
                return Unit.f23355a;
            default:
                a((ChatMessage) obj);
                return Unit.f23355a;
        }
    }
}
