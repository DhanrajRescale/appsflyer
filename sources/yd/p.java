package yd;

import com.assetgro.stockgro.data.model.ChatMessage;
import iu.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rd.m f41577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f41578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f41579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(boolean z10, rd.m mVar, ChatMessage chatMessage, int i10, z zVar, int i11) {
        super(1);
        this.f41575a = i11;
        this.f41576b = z10;
        this.f41577c = mVar;
        this.f41578d = chatMessage;
        this.f41579e = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f41575a;
        ChatMessage chatMessage = this.f41578d;
        z zVar = this.f41579e;
        rd.m mVar = this.f41577c;
        boolean z10 = this.f41576b;
        switch (i10) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!z10 && mVar != null) {
                    mVar.a(chatMessage, (String) zVar.f20560a);
                }
                return Unit.f23355a;
            default:
                ChatMessage it2 = (ChatMessage) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!z10 && mVar != null) {
                    mVar.a(chatMessage, (String) zVar.f20560a);
                }
                return Unit.f23355a;
        }
    }
}
