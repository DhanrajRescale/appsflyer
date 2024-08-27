package com.airbnb.deeplinkdispatch;

import iu.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n"}, d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class DeepLinkEntry$activityClass$2 extends k implements Function0<Class<?>> {
    final /* synthetic */ DeepLinkEntry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkEntry$activityClass$2(DeepLinkEntry deepLinkEntry) {
        super(0);
        this.this$0 = deepLinkEntry;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Class<?> mo2invoke() {
        try {
            return Class.forName(this.this$0.getClassName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Deeplink class " + this.this$0.getClassName() + " not found. If you are using Proguard/R8/Dexguard please consult README.md for correct configuration.", e10);
        }
    }
}
