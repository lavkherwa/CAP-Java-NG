using bp.store as store from '../../db/cds/store';

@path:'store'
service StoreService {

    entity Books as projection on store.Books;
	entity Authors as projection on store.Authors;
}
