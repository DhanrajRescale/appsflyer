package com.assetgro.stockgro.data.repository;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements et.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserRepository f8575b;

    public /* synthetic */ a(UserRepository userRepository, int i10) {
        this.f8574a = i10;
        this.f8575b = userRepository;
    }

    @Override // et.a
    public final void run() {
        int i10 = this.f8574a;
        UserRepository userRepository = this.f8575b;
        switch (i10) {
            case 0:
                UserRepository.a(userRepository);
                return;
            default:
                UserRepository.c(userRepository);
                return;
        }
    }
}
