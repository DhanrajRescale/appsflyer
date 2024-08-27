package com.airbnb.deeplinkdispatch;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import q3.b1;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Intent;", "component1", "Lq3/b1;", "component2", "intent", "taskStackBuilder", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "Lq3/b1;", "getTaskStackBuilder", "()Lq3/b1;", "<init>", "(Landroid/content/Intent;Lq3/b1;)V", "deeplinkdispatch_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final /* data */ class DeepLinkMethodResult {
    private final Intent intent;
    private final b1 taskStackBuilder;

    public DeepLinkMethodResult(Intent intent, b1 b1Var) {
        this.intent = intent;
        this.taskStackBuilder = b1Var;
    }

    public static /* synthetic */ DeepLinkMethodResult copy$default(DeepLinkMethodResult deepLinkMethodResult, Intent intent, b1 b1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            intent = deepLinkMethodResult.intent;
        }
        if ((i10 & 2) != 0) {
            b1Var = deepLinkMethodResult.taskStackBuilder;
        }
        return deepLinkMethodResult.copy(intent, b1Var);
    }

    /* renamed from: component1, reason: from getter */
    public final Intent getIntent() {
        return this.intent;
    }

    /* renamed from: component2, reason: from getter */
    public final b1 getTaskStackBuilder() {
        return this.taskStackBuilder;
    }

    @NotNull
    public final DeepLinkMethodResult copy(Intent intent, b1 taskStackBuilder) {
        return new DeepLinkMethodResult(intent, taskStackBuilder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepLinkMethodResult)) {
            return false;
        }
        DeepLinkMethodResult deepLinkMethodResult = (DeepLinkMethodResult) other;
        return Intrinsics.a(this.intent, deepLinkMethodResult.intent) && Intrinsics.a(this.taskStackBuilder, deepLinkMethodResult.taskStackBuilder);
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public final b1 getTaskStackBuilder() {
        return this.taskStackBuilder;
    }

    public int hashCode() {
        Intent intent = this.intent;
        int hashCode = (intent == null ? 0 : intent.hashCode()) * 31;
        b1 b1Var = this.taskStackBuilder;
        return hashCode + (b1Var != null ? b1Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeepLinkMethodResult(intent=" + this.intent + ", taskStackBuilder=" + this.taskStackBuilder + ')';
    }
}
