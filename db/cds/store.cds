namespace bp.store;

using {
    managed,
    cuid
} from '@sap/cds/common';


/*
	cuid -> https://cap.cloud.sap/docs/cds/common#aspect-cuid
	managed -> https://cap.cloud.sap/docs/cds/common#aspect-managed

*/
entity Books : cuid, managed {
    title  : String;
    stock  : Integer;
    author : Association to one Authors;
}


entity Authors : cuid, managed {
    name  : String(111);
    books : Association to many Books
                on books.author = $self;
}
