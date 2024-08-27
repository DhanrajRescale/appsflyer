package com.assetgro.stockgro.data;

import au.c;
import au.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@e(c = "com.assetgro.stockgro.data.ContactsUploadForegroundWorker", f = "ContactsUploadForegroundWorker.kt", l = {44}, m = "doWork")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContactsUploadForegroundWorker$doWork$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContactsUploadForegroundWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsUploadForegroundWorker$doWork$1(ContactsUploadForegroundWorker contactsUploadForegroundWorker, yt.a<? super ContactsUploadForegroundWorker$doWork$1> aVar) {
        super(aVar);
        this.this$0 = contactsUploadForegroundWorker;
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
